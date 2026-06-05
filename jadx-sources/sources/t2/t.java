package t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f15635a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f15636b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ t[] f15637c;

    static {
        t tVar = new t("Width", 0);
        f15635a = tVar;
        t tVar2 = new t("Height", 1);
        f15636b = tVar2;
        t[] tVarArr = {tVar, tVar2};
        f15637c = tVarArr;
        u0.c.j(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f15637c.clone();
    }
}
