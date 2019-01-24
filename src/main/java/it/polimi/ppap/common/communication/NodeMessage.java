package it.polimi.ppap.common.communication;

import peersim.core.Node;

public class NodeMessage
extends CommunityMessage{

    final Object content;

    public NodeMessage(Node sender, Object content){
        super(sender, NODE_CRT_MSG);
        this.content = content;
    }
}
