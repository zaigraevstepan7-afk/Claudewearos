package c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y5 {

    /* renamed from: a, reason: collision with root package name */
    public static final y5 f2911a;

    /* renamed from: b, reason: collision with root package name */
    public static final y5 f2912b;

    /* renamed from: c, reason: collision with root package name */
    public static final y5 f2913c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ y5[] f2914d;

    static {
        y5 y5Var = new y5("Hidden", 0);
        f2911a = y5Var;
        y5 y5Var2 = new y5("Expanded", 1);
        f2912b = y5Var2;
        y5 y5Var3 = new y5("PartiallyExpanded", 2);
        f2913c = y5Var3;
        y5[] y5VarArr = {y5Var, y5Var2, y5Var3};
        f2914d = y5VarArr;
        u0.c.j(y5VarArr);
    }

    public static y5 valueOf(String str) {
        return (y5) Enum.valueOf(y5.class, str);
    }

    public static y5[] values() {
        return (y5[]) f2914d.clone();
    }
}
