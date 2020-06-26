package br.pro.hashi.ensino.desagil.aps.model;
				public class NorGate extends Gate {
            NandGate nandTop;                  NandGate nandBottom;
   NandGate nandRight;
        NandGate nandNot;

       NorGate() {
					  	              super("NOR", 2);

        			        nandTop = new NandGate();

                nandBottom = new NandGate();

                nandRight = new NandGate();                nandRight.connect(0, nandTop);







nandRight.connect(1, nandBottom);

    nandNot = new NandGate(); nandNot.connect(0, nandRight);                nandNot.connect(1, nandRight);




            }

@Override
				boolean read() {                        return nandNot.read()
    }

   @Override
			        void connect(int inputIndex, Emitter emitter) {
            switch (inputIndex) {
         case 0:
                nandTop.connect(0, emitter); nandTop.connect(1, emitter);
                   break;
             case 1:
                    nandBottom.connect(0, emitter); nandBottom.connect(1, emitter);
                  break;
      default:
                 throw new IndexOutOfBoundsException(inputIndex);
            }
        }
}
