package org.ethereum.jsontestsuite;

import org.ethereum.jsontestsuite.model.AccountTck;
import org.ethereum.jsontestsuite.model.BlockHeaderTck;
import org.ethereum.jsontestsuite.model.BlockTck;

import java.util.List;
import java.util.Map;

public class BlockTestCase {

    private List<BlockTck> blocks;
    private BlockHeaderTck genesisBlockHeader;
    private Map<String, AccountTck> pre;
    private Map<String, AccountTck> postState;


    public BlockTestCase() {
    }

    public List<BlockTck> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<BlockTck> blocks) {
        this.blocks = blocks;
    }

    public BlockHeaderTck getGenesisBlockHeader() {
        return genesisBlockHeader;
    }

    public void setGenesisBlockHeader(BlockHeaderTck genesisBlockHeader) {
        this.genesisBlockHeader = genesisBlockHeader;
    }

    public Map<String, AccountTck> getPre() {
        return pre;
    }

    public void setPre(Map<String, AccountTck> pre) {
        this.pre = pre;
    }

    public Map<String, AccountTck> getPostState() {
        return postState;
    }

    public void setPostState(Map<String, AccountTck> postState) {
        this.postState = postState;
    }

    @Override
    public String toString() {
        return "BlockTestCase{" +
                "blocks=" + blocks +
                ", genesisBlockHeader=" + genesisBlockHeader +
                ", pre=" + pre +
                '}';
    }
}
