package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f1333a;

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f1334b;

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f1335c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g0[] f1336d;

    static {
        g0 g0Var = new g0("Vertical", 0);
        f1333a = g0Var;
        g0 g0Var2 = new g0("Horizontal", 1);
        f1334b = g0Var2;
        g0 g0Var3 = new g0("Both", 2);
        f1335c = g0Var3;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3};
        f1336d = g0VarArr;
        u0.c.j(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f1336d.clone();
    }
}
