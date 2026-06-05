package rb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f14317a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f14318b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f14319c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f14320d;

    static {
        d dVar = new d("DEFAULT", 0);
        f14317a = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f14318b = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f14319c = dVar3;
        f14320d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14320d.clone();
    }
}
