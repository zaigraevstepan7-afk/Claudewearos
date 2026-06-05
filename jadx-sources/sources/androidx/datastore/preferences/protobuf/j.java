package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public int f948a;

    /* renamed from: b, reason: collision with root package name */
    public Object f949b;

    public j(int i10) {
        this.f948a = i10;
    }

    public static int d(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long e(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static com.google.crypto.tink.shaded.protobuf.j h(byte[] bArr, int i10, int i11, boolean z2) {
        com.google.crypto.tink.shaded.protobuf.j jVar = new com.google.crypto.tink.shaded.protobuf.j(bArr, i10, i11, z2);
        try {
            jVar.q(i11);
            return jVar;
        } catch (com.google.crypto.tink.shaded.protobuf.c0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract long A();

    public abstract int B();

    public abstract long C();

    public abstract int D();

    public abstract long E();

    public abstract String F();

    public abstract String G();

    public abstract int H();

    public abstract int I();

    public abstract long J();

    public abstract boolean K(int i10);

    public void L() {
        int iH;
        do {
            iH = H();
            if (iH == 0) {
                return;
            }
            int i10 = this.f948a;
            if (i10 >= 100) {
                throw new a0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f948a = i10 + 1;
            this.f948a--;
        } while (K(iH));
    }

    public ByteBuffer a(int i10, byte[] bArr) {
        int[] iArrC = c(pf.a.c(bArr), i10);
        int[] iArr = (int[]) iArrC.clone();
        pf.a.b(iArr);
        for (int i11 = 0; i11 < iArrC.length; i11++) {
            iArrC[i11] = iArrC[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrC, 0, 16);
        return byteBufferOrder;
    }

    public abstract void b(int i10);

    public abstract int[] c(int[] iArr, int i10);

    public abstract int f();

    public abstract boolean g();

    public abstract int j();

    public abstract t4.m1 m(t4.m1 m1Var, List list);

    public abstract q5.b n(t4.v0 v0Var, q5.b bVar);

    public abstract void o(int i10);

    public void p(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != j()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + j());
        }
        int iRemaining = byteBuffer2.remaining();
        int i10 = iRemaining / 64;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            ByteBuffer byteBufferA = a(this.f948a + i12, bArr);
            if (i12 == i10) {
                cg.b.V(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                cg.b.V(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    public abstract int q(int i10);

    public abstract boolean r();

    public abstract g s();

    public abstract com.google.crypto.tink.shaded.protobuf.h t();

    public abstract double u();

    public abstract int v();

    public abstract int w();

    public abstract long x();

    public abstract float y();

    public abstract int z();

    public void k(t4.v0 v0Var) {
    }

    public void l(t4.v0 v0Var) {
    }
}
