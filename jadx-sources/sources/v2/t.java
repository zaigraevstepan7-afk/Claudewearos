package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f17756a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f17757b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f17758c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f17759d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ t[] f17760e;

    static {
        t tVar = new t("LookaheadMeasurement", 0);
        f17756a = tVar;
        t tVar2 = new t("LookaheadPlacement", 1);
        f17757b = tVar2;
        t tVar3 = new t("Measurement", 2);
        f17758c = tVar3;
        t tVar4 = new t("Placement", 3);
        f17759d = tVar4;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4};
        f17760e = tVarArr;
        u0.c.j(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f17760e.clone();
    }
}
