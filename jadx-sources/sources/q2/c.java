package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f13185a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f13186b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f13187c;

    static {
        c cVar = new c("Lsq2", 0);
        f13185a = cVar;
        c cVar2 = new c("Impulse", 1);
        f13186b = cVar2;
        c[] cVarArr = {cVar, cVar2};
        f13187c = cVarArr;
        u0.c.j(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f13187c.clone();
    }
}
