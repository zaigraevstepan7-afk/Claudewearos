package g7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f7232a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f7233b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f7234c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f7235d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f7236e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ e[] f7237f;

    static {
        e eVar = new e("ON_CONFIGURE", 0);
        f7232a = eVar;
        e eVar2 = new e("ON_CREATE", 1);
        f7233b = eVar2;
        e eVar3 = new e("ON_UPGRADE", 2);
        f7234c = eVar3;
        e eVar4 = new e("ON_DOWNGRADE", 3);
        f7235d = eVar4;
        e eVar5 = new e("ON_OPEN", 4);
        f7236e = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        f7237f = eVarArr;
        u0.c.j(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f7237f.clone();
    }
}
