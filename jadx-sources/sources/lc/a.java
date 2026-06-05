package lc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10895a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f10896b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f10897c;

    static {
        a aVar = new a("NOT_READY", 0);
        f10895a = aVar;
        a aVar2 = new a("READY", 1);
        f10896b = aVar2;
        f10897c = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10897c.clone();
    }
}
