package OOP.Classes;

import OOP.Interfaces.IActorBehaviour;

public class App {
//    addClients addclients = new addClients();

    public static void main(String[] args) {
//        List<IActorBehaviour> getListFromaddClintsList = new ArrayList<>();
//        addClients addclients = new addClients();
        Market market = new Market();
        try {
            IActorBehaviour item1 = new OrdinaryClient("Sam", "Carter");
            IActorBehaviour item2 = new SpecialClient("Alex", "Ballew", 1);
            IActorBehaviour item3 = new OrdinaryClient("Name1", "Name1");
            IActorBehaviour item4 = new PromoClient("Name2", "Name2", 1);
            IActorBehaviour item5 = new PromoClient("Name3", "Name3", 2);
            IActorBehaviour item6 = new PromoClient("Name4", "Name4", 3);
            market.acceptToMarket(item1);
            market.acceptToMarket(item2);
            market.acceptToMarket(item3);
            market.acceptToMarket(item4);
            market.acceptToMarket(item5);
            market.acceptToMarket(item6);
            market.Update();
        } catch (Exception error) {
            System.out.println("Promo clients max amount is reached");
        }

//        List<IActorBehaviour> clients = new ArrayList<>();
//         try {
//            addclients.add(new OrdinaryClient("Sam", "Carter"));
//            addclients.add(new SpecialClient("Alex", "Ballew", 1));
//            addclients.add(new PromoClient("Name1", "Name1", 1));
//            addclients.add(new PromoClient("Name2", "Name2", 2));
//            addclients.add(new PromoClient("Name3", "Name3", 3));
//        } catch (Exception error) {
//            System.out.println("Promo clients max amount is reached");
//        }
//        try {
//            getListFromaddClintsList.add(new OrdinaryClient("Sam", "Carter"));
//            getListFromaddClintsList.add(new SpecialClient("Alex", "Ballew", 1));
//            getListFromaddClintsList.add(new PromoClient("Name1", "Name1", 1));
//            getListFromaddClintsList.add(new PromoClient("Name2", "Name2", 2));
//            getListFromaddClintsList.add(new PromoClient("Name3", "Name3", 3));
//        } catch (Exception error) {
//            System.out.println("Promo clients max amount is reached");
//        }
//
//    }
//    public List<IActorBehaviour> getListFromaddClintsList() {
//        return this.addclients.getClientsList();
//    }

//        try {
//            addclients.addlient(new OrdinaryClient("Sam", "Carter"));
//            addclients.addlient(new SpecialClient("Alex", "Ballew", 1));
//            addclients.addlient(new PromoClient("Name1", "Name1", 1));
//            addclients.addlient(new PromoClient("Name2", "Name2", 2));
//            addclients.addlient(new PromoClient("Name3", "Name3", 3));
//        } catch (Exception error) {
//            System.out.println("Promo clients max amount is reached");
//        }

//        try {
//            clients.add(new OrdinaryClient("Sam", "Carter"));
//            clients.add(new SpecialClient("Alex", "Ballew", 1));
//            clients.add(new PromoClient("Name1", "Name1", 1));
//            clients.add(new PromoClient("Name2", "Name2", 2));
//            clients.add(new PromoClient("Name3", "Name3", 3));
//        } catch (Exception error) {
//            System.out.println("Promo clients max amount is reached");
//        }
//
//        for (IActorBehaviour client :
//                clients) {
//            market.acceptToMarket(client);
//        }
//        market.acceptToMarket(new TaxService());
//
//
//        market.Update();
//    }

    }
}

