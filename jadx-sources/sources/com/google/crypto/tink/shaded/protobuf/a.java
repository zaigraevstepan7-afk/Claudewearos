package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a implements q0 {
    protected int memoizedHashCode;

    public abstract int b(b1 b1Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract u d();

    public final byte[] e() {
        try {
            int iB = ((w) this).b(null);
            byte[] bArr = new byte[iB];
            l lVar = new l(bArr, iB);
            f(lVar);
            if (iB - lVar.f4194g == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(c("byte array"), e10);
        }
    }

    public abstract void f(l lVar);
}
