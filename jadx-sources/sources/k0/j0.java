package k0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f9133a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f9134b;

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f9135c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j0[] f9136d;

    static {
        j0 j0Var = new j0("Cursor", 0);
        f9133a = j0Var;
        j0 j0Var2 = new j0("SelectionStart", 1);
        f9134b = j0Var2;
        j0 j0Var3 = new j0("SelectionEnd", 2);
        f9135c = j0Var3;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3};
        f9136d = j0VarArr;
        u0.c.j(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f9136d.clone();
    }
}
