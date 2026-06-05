package f1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final w1 f6471a;

    /* renamed from: b, reason: collision with root package name */
    public static final w1 f6472b;

    /* renamed from: c, reason: collision with root package name */
    public static final w1 f6473c;

    /* renamed from: d, reason: collision with root package name */
    public static final w1 f6474d;

    /* renamed from: e, reason: collision with root package name */
    public static final w1 f6475e;

    /* renamed from: f, reason: collision with root package name */
    public static final w1 f6476f;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ w1[] f6477z;

    static {
        w1 w1Var = new w1("ShutDown", 0);
        f6471a = w1Var;
        w1 w1Var2 = new w1("ShuttingDown", 1);
        f6472b = w1Var2;
        w1 w1Var3 = new w1("Inactive", 2);
        f6473c = w1Var3;
        w1 w1Var4 = new w1("InactivePendingWork", 3);
        f6474d = w1Var4;
        w1 w1Var5 = new w1("Idle", 4);
        f6475e = w1Var5;
        w1 w1Var6 = new w1("PendingWork", 5);
        f6476f = w1Var6;
        w1[] w1VarArr = {w1Var, w1Var2, w1Var3, w1Var4, w1Var5, w1Var6};
        f6477z = w1VarArr;
        u0.c.j(w1VarArr);
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) f6477z.clone();
    }
}
