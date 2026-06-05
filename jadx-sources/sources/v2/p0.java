package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f17739a;

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f17740b;

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f17741c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ p0[] f17742d;

    static {
        p0 p0Var = new p0("IsPlacedInLookahead", 0);
        f17739a = p0Var;
        p0 p0Var2 = new p0("IsPlacedInApproach", 1);
        f17740b = p0Var2;
        p0 p0Var3 = new p0("IsNotPlaced", 2);
        f17741c = p0Var3;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3};
        f17742d = p0VarArr;
        u0.c.j(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f17742d.clone();
    }
}
