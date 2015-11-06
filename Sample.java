ArrayList <String> array = new ArrayList <String>();

try {
  Scanner read = new Scanner(new File ("Data"));
  
  while (read.hasNext()) {
    array.add(read.nextInt());
  }
  
  read.close();
} catch (Exception e) {
  System.out.print("Error.");
  System.exit(-1);
}
