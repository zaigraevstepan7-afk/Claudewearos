package zf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j1 extends com.google.crypto.tink.shaded.protobuf.w {
    private static final j1 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.w0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.z keyInfo_ = com.google.crypto.tink.shaded.protobuf.z0.f4249d;
    private int primaryKeyId_;

    static {
        j1 j1Var = new j1();
        DEFAULT_INSTANCE = j1Var;
        com.google.crypto.tink.shaded.protobuf.w.t(j1.class, j1Var);
    }

    public static void w(j1 j1Var, int i10) {
        j1Var.primaryKeyId_ = i10;
    }

    public static void x(j1 j1Var, i1 i1Var) {
        j1Var.getClass();
        com.google.crypto.tink.shaded.protobuf.z zVar = j1Var.keyInfo_;
        if (!((com.google.crypto.tink.shaded.protobuf.b) zVar).f4139a) {
            int size = zVar.size();
            j1Var.keyInfo_ = zVar.f(size == 0 ? 10 : size * 2);
        }
        j1Var.keyInfo_.add(i1Var);
    }

    public static g1 z() {
        return (g1) DEFAULT_INSTANCE.h();
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
                return new com.google.crypto.tink.shaded.protobuf.a1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", i1.class});
            case 3:
                return new j1();
            case 4:
                return new g1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.w0 w0Var = PARSER;
                if (w0Var != null) {
                    return w0Var;
                }
                synchronized (j1.class) {
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

    public final i1 y() {
        return (i1) this.keyInfo_.get(0);
    }
}
