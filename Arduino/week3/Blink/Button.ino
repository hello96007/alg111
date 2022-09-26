void setup() {
  // put your setup code here, to run once:
pinMode(2,OUTPUT);
pinMode(3,OUTPUT);
pinMode(4,OUTPUT);
}

void loop() {
  int i =2;
  while(i<=4)
  {
  digitalWrite(i,HIGH);
  delay(5000-((i%2)*4500));
  digitalWrite(i,LOW);
  delay(500);
  /*loop2法二
  if(i==4)
  delay(1000);
  else
  delay(3000);
  digitalWrite(i,LOW);
  delay(500);
  */
  //char S="HIGH";
  for(int k=0;k<2;k++)
  {
  digitalWrite(i,HIGH);
  delay(200);
  digitalWrite(i,LOW);
  delay(200);
   }  
  i++;
    }
}
//第一色與第二色乘以倍數
//Button與switch 差別
//Switch會一直保持狀態，Button按的時候才會改變狀態
