package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f1111a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f1112b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f1113c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f1114d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f1115e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o[] f1116f;

    static {
        o oVar = new o("DESTROYED", 0);
        f1111a = oVar;
        o oVar2 = new o("INITIALIZED", 1);
        f1112b = oVar2;
        o oVar3 = new o("CREATED", 2);
        f1113c = oVar3;
        o oVar4 = new o("STARTED", 3);
        f1114d = oVar4;
        o oVar5 = new o("RESUMED", 4);
        f1115e = oVar5;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5};
        f1116f = oVarArr;
        u0.c.j(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f1116f.clone();
    }
}
