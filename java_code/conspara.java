class conspara{
    String name;
    int id;
    conspara(String name,int id)
    {
        this.name=name;
        this.id=id;
    }    
    public static void main(String[] args)
    {
        conspara m =new conspara("shreya",1);
        System.out.println("Name:"+ m.name+" and ID:"+m.id);
    }
}