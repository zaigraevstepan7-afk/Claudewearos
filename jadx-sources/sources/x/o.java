package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f19659a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f19660b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f19661c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o[] f19662d;

    static {
        o oVar = new o("Yes", 0);
        f19659a = oVar;
        o oVar2 = new o("No", 1);
        f19660b = oVar2;
        o oVar3 = new o("NotInitialized", 2);
        f19661c = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        f19662d = oVarArr;
        u0.c.j(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f19662d.clone();
    }
}
