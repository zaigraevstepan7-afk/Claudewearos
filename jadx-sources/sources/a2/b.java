package a2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f7b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f8c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f9d;

    static {
        b bVar = new b("None", 0);
        f6a = bVar;
        b bVar2 = new b("Cancelled", 1);
        f7b = bVar2;
        b bVar3 = new b("Redirected", 2);
        f8c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3, new b("RedirectCancelled", 3)};
        f9d = bVarArr;
        u0.c.j(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f9d.clone();
    }
}
