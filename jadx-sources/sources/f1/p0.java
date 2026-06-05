package f1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f6407a;

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f6408b;

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f6409c;

    /* renamed from: d, reason: collision with root package name */
    public static final p0 f6410d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ p0[] f6411e;

    static {
        p0 p0Var = new p0("IGNORED", 0);
        f6407a = p0Var;
        p0 p0Var2 = new p0("SCHEDULED", 1);
        f6408b = p0Var2;
        p0 p0Var3 = new p0("DEFERRED", 2);
        f6409c = p0Var3;
        p0 p0Var4 = new p0("IMMINENT", 3);
        f6410d = p0Var4;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3, p0Var4};
        f6411e = p0VarArr;
        u0.c.j(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f6411e.clone();
    }
}
