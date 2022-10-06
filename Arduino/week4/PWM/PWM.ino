//PWM
void setup() {
  // put your setup code here, to run once:

}

void loop() {
  // put your main code here, to run repeatedly:
  for(int i =0;i<=255;i+=100)
  {
    analogWrite(9,i);
    delay(30);
  }
  for(int j=255 ;j>=0;j-=100)
  {
    analogWrite(9,j);
    delay(30);
  }
}
