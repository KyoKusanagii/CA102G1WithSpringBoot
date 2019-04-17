package com.ca102g1.springboot.model;

public class MemberWithBLOBs extends Member {
    private byte[] memProfilepic;

    private byte[] memMartcover;

    public byte[] getMemProfilepic() {
        return memProfilepic;
    }

    public void setMemProfilepic(byte[] memProfilepic) {
        this.memProfilepic = memProfilepic;
    }

    public byte[] getMemMartcover() {
        return memMartcover;
    }

    public void setMemMartcover(byte[] memMartcover) {
        this.memMartcover = memMartcover;
    }
}