/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zonaAzulDigital.interfaces;

import com.zonaAzulDigital.Excecao.CartaoZAException;
import com.zonaAzulDigital.Excecao.DaoException;
import com.zonaAzulDigital.Excecao.MotoristaException;
import com.zonaAzulDigital.Excecao.PlacaException;
import com.zonaAzulDigital.entidades.CartaoZonaAzul;
import com.zonaAzulDigital.entidades.CartaoZonaAzulInfo;
import com.zonaAzulDigital.entidades.Motorista;
import com.zonaAzulDigital.entidades.Placa;
import com.zonaAzulDigital.entidades.VendaMes;
import java.util.List;

/**
 *
 * @author JonasJr
 */
public interface ModelCartaoZonaAzulInterface {

    CartaoZonaAzulInfo cadastrarDetalhes(CartaoZonaAzulInfo cartaoZonaAzulInfo) throws CartaoZAException, DaoException;

    CartaoZonaAzul comprar(Motorista motorista, Placa placa) throws MotoristaException, DaoException, PlacaException;

    CartaoZonaAzul recuperar(CartaoZonaAzul cartaoZA) throws DaoException;

    CartaoZonaAzul recuperarUltimo(Placa placa) throws DaoException, PlacaException;

    List<CartaoZonaAzul> CartoesAtivosPor(Motorista m);

    List<VendaMes> vendasNoMes(int ano) throws DaoException;

    List<CartaoZonaAzul> recuperarTodosCartoesPor(Motorista motorista);

    CartaoZonaAzul recuperaCartaoAtivo(Placa placa) throws PlacaException, DaoException;
}
