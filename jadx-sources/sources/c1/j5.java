package c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j5 {

    /* renamed from: a, reason: collision with root package name */
    public static final j5 f2286a;

    /* renamed from: b, reason: collision with root package name */
    public static final j5 f2287b;

    /* renamed from: c, reason: collision with root package name */
    public static final j5 f2288c;

    /* renamed from: d, reason: collision with root package name */
    public static final j5 f2289d;

    /* renamed from: e, reason: collision with root package name */
    public static final j5 f2290e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ j5[] f2291f;

    static {
        j5 j5Var = new j5("TopBar", 0);
        f2286a = j5Var;
        j5 j5Var2 = new j5("MainContent", 1);
        f2287b = j5Var2;
        j5 j5Var3 = new j5("Snackbar", 2);
        f2288c = j5Var3;
        j5 j5Var4 = new j5("Fab", 3);
        f2289d = j5Var4;
        j5 j5Var5 = new j5("BottomBar", 4);
        f2290e = j5Var5;
        j5[] j5VarArr = {j5Var, j5Var2, j5Var3, j5Var4, j5Var5};
        f2291f = j5VarArr;
        u0.c.j(j5VarArr);
    }

    public static j5 valueOf(String str) {
        return (j5) Enum.valueOf(j5.class, str);
    }

    public static j5[] values() {
        return (j5[]) f2291f.clone();
    }
}
