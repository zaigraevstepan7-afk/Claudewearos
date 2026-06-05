package zf;

import java.io.ByteArrayInputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n0 extends com.google.crypto.tink.shaded.protobuf.w {
    private static final n0 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.w0 PARSER;
    private com.google.crypto.tink.shaded.protobuf.i encryptedKeyset_ = com.google.crypto.tink.shaded.protobuf.i.f4171b;
    private j1 keysetInfo_;

    static {
        n0 n0Var = new n0();
        DEFAULT_INSTANCE = n0Var;
        com.google.crypto.tink.shaded.protobuf.w.t(n0.class, n0Var);
    }

    public static n0 A(ByteArrayInputStream byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.o oVar) throws com.google.crypto.tink.shaded.protobuf.c0 {
        com.google.crypto.tink.shaded.protobuf.w wVarS = com.google.crypto.tink.shaded.protobuf.w.s(DEFAULT_INSTANCE, new com.google.crypto.tink.shaded.protobuf.k(byteArrayInputStream), oVar);
        com.google.crypto.tink.shaded.protobuf.w.g(wVarS);
        return (n0) wVarS;
    }

    public static void w(n0 n0Var, com.google.crypto.tink.shaded.protobuf.h hVar) {
        n0Var.getClass();
        n0Var.encryptedKeyset_ = hVar;
    }

    public static void x(n0 n0Var, j1 j1Var) {
        n0Var.getClass();
        n0Var.keysetInfo_ = j1Var;
    }

    public static m0 z() {
        return (m0) DEFAULT_INSTANCE.h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.w0 vVar;
        switch (y3.e.b(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.a1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new n0();
            case 4:
                return new m0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.w0 w0Var = PARSER;
                if (w0Var != null) {
                    return w0Var;
                }
                synchronized (n0.class) {
                    try {
                        vVar = PARSER;
                        if (vVar == null) {
                            vVar = new com.google.crypto.tink.shaded.protobuf.v();
                            PARSER = vVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return vVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final com.google.crypto.tink.shaded.protobuf.i y() {
        return this.encryptedKeyset_;
    }
}
