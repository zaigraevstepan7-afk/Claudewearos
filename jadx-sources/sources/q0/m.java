package q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f13170a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f13171b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f13172c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ m[] f13173d;

    static {
        m mVar = new m("Uninitialized", 0);
        f13170a = mVar;
        m mVar2 = new m("Detached", 1);
        f13171b = mVar2;
        m mVar3 = new m("Attached", 2);
        f13172c = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
        f13173d = mVarArr;
        u0.c.j(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f13173d.clone();
    }
}
