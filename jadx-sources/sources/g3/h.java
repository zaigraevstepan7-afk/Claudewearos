package g3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {
    public static final /* synthetic */ h[] A;

    /* renamed from: a, reason: collision with root package name */
    public static final h f7104a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f7105b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f7106c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f7107d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f7108e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f7109f;

    /* renamed from: z, reason: collision with root package name */
    public static final h f7110z;

    static {
        h hVar = new h("Paragraph", 0);
        f7104a = hVar;
        h hVar2 = new h("Span", 1);
        f7105b = hVar2;
        h hVar3 = new h("VerbatimTts", 2);
        f7106c = hVar3;
        h hVar4 = new h("Url", 3);
        f7107d = hVar4;
        h hVar5 = new h("Link", 4);
        f7108e = hVar5;
        h hVar6 = new h("Clickable", 5);
        f7109f = hVar6;
        h hVar7 = new h("String", 6);
        f7110z = hVar7;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7};
        A = hVarArr;
        u0.c.j(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) A.clone();
    }
}
