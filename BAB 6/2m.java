class Luar {
    private int a;
    public void setA(int nilai) {
        a = nilai;
    }
    public int getA() {
        return a;
    }

    // mendefinisikan inner class
    class Dalam {
        private int x = 10; // hanya dikenal oleh kelas Dalam
        public void showData() {
            System.out.println("Nilai a dari kelas Luar: " + a);
            System.out.println("Nilai x dari kelas Dalam: " + x);
        }
    }
}
Public void showData(){
    //Baris dibawah ini SALAH, karena x tidak dikenal disini
    //System.out.println("Nilai x dari kelas dalam:"+x);

      Dalam obj=new Dalam();
      Obj.showData();
}