interface Account {
        void getBalance();
        void getAccount();
}

class Current implements Account {
    public void getBalance() {
        System.out.println("The Balance is :- ");
    }

    @Override
    public void getAccount() {
        // TODO Auto-generated method stub
        
    }
}

class Salary implements Account {
    public void getAccount() {
        System.out.println("Account is :- ");
    }

    @Override
    public void getBalance() {
        // TODO Auto-generated method stub
        
    }
}

class program11 {
    public static void main(String args[]) {
        Current obj1 = new Current();
        obj1.getBalance();
        Salary obj2 = new Salary();
        obj2.getAccount();
    }
}