package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t1 {
    public static final t1 A;
    public static final t1 B;
    public static final /* synthetic */ t1[] C;

    /* renamed from: a, reason: collision with root package name */
    public static final t1 f1016a;

    /* renamed from: b, reason: collision with root package name */
    public static final t1 f1017b;

    /* renamed from: c, reason: collision with root package name */
    public static final t1 f1018c;

    /* renamed from: d, reason: collision with root package name */
    public static final t1 f1019d;

    /* renamed from: e, reason: collision with root package name */
    public static final t1 f1020e;

    /* renamed from: f, reason: collision with root package name */
    public static final t1 f1021f;

    /* renamed from: z, reason: collision with root package name */
    public static final t1 f1022z;

    static {
        t1 t1Var = new t1("INT", 0);
        f1016a = t1Var;
        t1 t1Var2 = new t1("LONG", 1);
        f1017b = t1Var2;
        t1 t1Var3 = new t1("FLOAT", 2);
        f1018c = t1Var3;
        t1 t1Var4 = new t1("DOUBLE", 3);
        f1019d = t1Var4;
        t1 t1Var5 = new t1("BOOLEAN", 4);
        f1020e = t1Var5;
        t1 t1Var6 = new t1("STRING", 5);
        f1021f = t1Var6;
        g gVar = g.f927c;
        t1 t1Var7 = new t1("BYTE_STRING", 6);
        f1022z = t1Var7;
        t1 t1Var8 = new t1("ENUM", 7);
        A = t1Var8;
        t1 t1Var9 = new t1("MESSAGE", 8);
        B = t1Var9;
        C = new t1[]{t1Var, t1Var2, t1Var3, t1Var4, t1Var5, t1Var6, t1Var7, t1Var8, t1Var9};
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) C.clone();
    }
}
