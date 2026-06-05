package p2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f12669a;

    /* renamed from: b, reason: collision with root package name */
    public static final b0 f12670b;

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f12671c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b0[] f12672d;

    static {
        b0 b0Var = new b0("Unknown", 0);
        f12669a = b0Var;
        b0 b0Var2 = new b0("Dispatching", 1);
        f12670b = b0Var2;
        b0 b0Var3 = new b0("NotDispatching", 2);
        f12671c = b0Var3;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3};
        f12672d = b0VarArr;
        u0.c.j(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f12672d.clone();
    }
}
