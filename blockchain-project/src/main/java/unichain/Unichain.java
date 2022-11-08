package unichain;
import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class Unichain {

    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    
    public static void main(String[] args) {
        blockchain.add(new Block("Sono il PRIMO blocco", "0"));
        blockchain.add(new Block("Sono il SECONDO blocco",
        blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("Sono il TERZO blocco",
        blockchain.get(blockchain.size()-1).hash));

    String blockchainJson = new

GsonBuilder().setPrettyPrinting().create().toJson(blockchain);

System.out.println(blockchainJson);
}

public static Boolean isChainValid() {
    Block currentBlock;
    Block previousBlock;
    for(int i=1; i < blockchain.size(); i++) {
    currentBlock = blockchain.get(i);
    previousBlock = blockchain.get(i-1);
    if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
        System.out.println("Current Hashes not equal");
        return false;
        }
        if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
        System.out.println("Previous Hashes not equal");
        return false;
        }
    }
    return true;
}



}