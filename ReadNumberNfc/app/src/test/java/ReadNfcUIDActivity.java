//public class ReadNfcUIDActivity {
//    @Override
//    protected void onResume() {
//        super.onResume();
//        if (getIntent().getAction().equals(NfcAdapter.ACTION_TAG_DISCOVERED)) {
//            ((TextView)findViewById(R.id.text)).setText(
//                    "NFC Tag\n" +
//                            this.ByteArrayToHexString(getIntent().getByteArrayExtra(NfcAdapter.EXTRA_ID)));
//        }
//    }
//
//    // Converting byte[] to hex string:
//    private String ByteArrayToHexString(byte [] inarray) {
//        int i, j, in;
//        String [] hex = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
//        String out= "";
//
//        for(j = 0 ; j < inarray.length ; ++j)
//        {
//            in = (int) inarray[j] & 0xff;
//            i = (in >> 4) & 0x0f;
//            out += hex[i];
//            i = in & 0x0f;
//            out += hex[i];
//        }
//        return out;
//    }
//}
