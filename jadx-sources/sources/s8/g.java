package s8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f14783a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f14784b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f14785c;

    static {
        g gVar = new g("FILL", 0);
        f14783a = gVar;
        g gVar2 = new g("FIT", 1);
        f14784b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f14785c = gVarArr;
        u0.c.j(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f14785c.clone();
    }
}
