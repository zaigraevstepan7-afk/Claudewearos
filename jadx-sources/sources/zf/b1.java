package zf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b1 extends com.google.crypto.tink.shaded.protobuf.w {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final b1 DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.w0 PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    static {
        b1 b1Var = new b1();
        DEFAULT_INSTANCE = b1Var;
        com.google.crypto.tink.shaded.protobuf.w.t(b1.class, b1Var);
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
                return new com.google.crypto.tink.shaded.protobuf.a1(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u000b\u0004\u0007\u0005\u0208", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 3:
                return new b1();
            case 4:
                return new k0(DEFAULT_INSTANCE, 1);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.w0 w0Var = PARSER;
                if (w0Var != null) {
                    return w0Var;
                }
                synchronized (b1.class) {
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
}
