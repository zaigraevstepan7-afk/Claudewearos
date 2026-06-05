package aa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f227a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f228b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f229c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f230d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f231e;

    static {
        b bVar = new b("LOW", 0);
        f227a = bVar;
        b bVar2 = new b("MEDIUM", 1);
        f228b = bVar2;
        b bVar3 = new b("HIGH", 2);
        f229c = bVar3;
        b bVar4 = new b("EXTRA_HIGH", 3);
        f230d = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f231e = bVarArr;
        u0.c.j(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f231e.clone();
    }
}
