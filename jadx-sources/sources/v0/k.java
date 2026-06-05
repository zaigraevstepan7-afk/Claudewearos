package v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f17408a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f17409b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f17410c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f17411d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ k[] f17412e;

    static {
        k kVar = new k("Up", 0);
        f17408a = kVar;
        k kVar2 = new k("Drag", 1);
        f17409b = kVar2;
        k kVar3 = new k("Timeout", 2);
        f17410c = kVar3;
        k kVar4 = new k("Cancel", 3);
        f17411d = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        f17412e = kVarArr;
        u0.c.j(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f17412e.clone();
    }
}
