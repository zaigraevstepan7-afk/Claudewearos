package mi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f11785a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f11786b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ t[] f11787c;

    static {
        t tVar = new t("Effect", 0);
        f11785a = tVar;
        t tVar2 = new t("Source", 1);
        f11786b = tVar2;
        t[] tVarArr = {tVar, tVar2};
        f11787c = tVarArr;
        u0.c.j(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f11787c.clone();
    }
}
