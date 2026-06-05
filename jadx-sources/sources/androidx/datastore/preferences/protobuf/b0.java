package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 {
    public static final b0 A;
    public static final b0 B;
    public static final b0 C;
    public static final /* synthetic */ b0[] D;

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f896a;

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f897b;

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f898c;

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f899d;

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f900e;

    /* renamed from: f, reason: collision with root package name */
    public static final b0 f901f;

    /* renamed from: z, reason: collision with root package name */
    public static final b0 f902z;

    static {
        b0 b0Var = new b0("VOID", 0);
        f896a = b0Var;
        b0 b0Var2 = new b0("INT", 1);
        f897b = b0Var2;
        b0 b0Var3 = new b0("LONG", 2);
        f898c = b0Var3;
        b0 b0Var4 = new b0("FLOAT", 3);
        f899d = b0Var4;
        b0 b0Var5 = new b0("DOUBLE", 4);
        f900e = b0Var5;
        b0 b0Var6 = new b0("BOOLEAN", 5);
        f901f = b0Var6;
        b0 b0Var7 = new b0("STRING", 6);
        f902z = b0Var7;
        g gVar = g.f927c;
        b0 b0Var8 = new b0("BYTE_STRING", 7);
        A = b0Var8;
        b0 b0Var9 = new b0("ENUM", 8);
        B = b0Var9;
        b0 b0Var10 = new b0("MESSAGE", 9);
        C = b0Var10;
        D = new b0[]{b0Var, b0Var2, b0Var3, b0Var4, b0Var5, b0Var6, b0Var7, b0Var8, b0Var9, b0Var10};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) D.clone();
    }
}
