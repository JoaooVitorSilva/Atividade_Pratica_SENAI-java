package br.com.senai;

import br.com.senai.service.MenuService;

public class Application {

    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        menuService.menuPrincipal();
    }
}