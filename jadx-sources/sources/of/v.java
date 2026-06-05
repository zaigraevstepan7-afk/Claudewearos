package of;

import com.google.crypto.tink.shaded.protobuf.c0;
import f0.i0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import u6.a0;
import zf.a1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class v implements nf.a {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f12499c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final a1 f12500a;

    /* renamed from: b, reason: collision with root package name */
    public final tf.b f12501b;

    public v(a1 a1Var, tf.b bVar) {
        this.f12500a = a1Var;
        this.f12501b = bVar;
    }

    @Override // nf.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws InterruptedException {
        com.google.crypto.tink.shaded.protobuf.a aVarF;
        a1 a1Var = this.f12500a;
        AtomicReference atomicReference = nf.n.f12333a;
        synchronized (nf.n.class) {
            try {
                a0 a0Var = ((nf.e) nf.n.f12333a.get()).a(a1Var.B()).f12313a;
                Class cls = (Class) a0Var.f16684c;
                if (!((Map) a0Var.f16683b).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + a0Var.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) nf.n.f12335c.get(a1Var.B())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + a1Var.B());
                }
                com.google.crypto.tink.shaded.protobuf.i iVarC = a1Var.C();
                try {
                    i0 i0VarF = a0Var.f();
                    com.google.crypto.tink.shaded.protobuf.a aVarM = i0VarF.m(iVarC);
                    i0VarF.s(aVarM);
                    aVarF = i0VarF.f(aVarM);
                } catch (c0 e10) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) a0Var.f().f6149a).getName()), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        byte[] bArrE = aVarF.e();
        byte[] bArrA = this.f12501b.a(bArrE, f12499c);
        byte[] bArrA2 = ((nf.a) nf.n.d(this.f12500a.B(), bArrE)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override // nf.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, InterruptedException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((nf.a) nf.n.d(this.f12500a.B(), this.f12501b.b(bArr3, f12499c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
