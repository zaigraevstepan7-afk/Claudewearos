package h7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f7671a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f7672b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f7673c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f7674d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f7675e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f7676f;

    static {
        c cVar = new c("END", 0);
        f7671a = cVar;
        c cVar2 = new c("ROLLBACK", 1);
        f7672b = cVar2;
        c cVar3 = new c("BEGIN_EXCLUSIVE", 2);
        f7673c = cVar3;
        c cVar4 = new c("BEGIN_IMMEDIATE", 3);
        f7674d = cVar4;
        c cVar5 = new c("BEGIN_DEFERRED", 4);
        f7675e = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f7676f = cVarArr;
        u0.c.j(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f7676f.clone();
    }
}
