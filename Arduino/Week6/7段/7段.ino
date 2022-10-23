byte seven[10][7] = { { 1,1,1,1,1,1,0 },  // = 0
                                 { 0,1,1,0,0,0,0 },  // = 1
                                 { 1,1,0,1,1,0,1 },  // = 2
                                 { 1,1,1,1,0,0,1 },  // = 3
                                 { 0,1,1,0,0,1,1 },  // = 4
                                 { 1,0,1,1,0,1,1 },  // = 5
                                 { 1,0,1,1,1,1,1 },  // = 6
                                 { 1,1,1,0,0,0,0 },  // = 7
                                 { 1,1,1,1,1,1,1 },  // = 8
                                 { 1,1,1,0,0,1,1 }   // = 9
                             };

void setup() {
  // put your setup code here, to run once:
for(int j=1;j<=8;j++)
pinMode(j,OUTPUT);


}

void loop() {
  // put your main code here, to run repeatedly:
for(int i = 0;i<=9;i++)
{
  for(int k=1;k<=7;k++)
  {
    digitalWrite(k,seven[i][k-1]);

  }
  for(int l=0;l<i;l++)
  {
  digitalWrite(8,1);    
  delay(500);
  digitalWrite(8,0);   
  delay(500); 
  }
  delay(1000);
}

 
  

  
//digitalWrite(seven_seg_digits[i][7],0);

}
