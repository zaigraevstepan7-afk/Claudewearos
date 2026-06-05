package p2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f12743a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f12744b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f12745c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o[] f12746d;

    static {
        o oVar = new o("Initial", 0);
        f12743a = oVar;
        o oVar2 = new o("Main", 1);
        f12744b = oVar2;
        o oVar3 = new o("Final", 2);
        f12745c = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        f12746d = oVarArr;
        u0.c.j(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f12746d.clone();
    }
}
