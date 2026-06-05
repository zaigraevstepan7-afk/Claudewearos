package s3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f14752a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f14753b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ m[] f14754c;

    static {
        m mVar = new m("Ltr", 0);
        f14752a = mVar;
        m mVar2 = new m("Rtl", 1);
        f14753b = mVar2;
        m[] mVarArr = {mVar, mVar2};
        f14754c = mVarArr;
        u0.c.j(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f14754c.clone();
    }
}
