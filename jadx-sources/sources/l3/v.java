package l3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f9942a;

    /* renamed from: b, reason: collision with root package name */
    public static final v f9943b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f9944c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f9945d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ v[] f9946e;

    static {
        v vVar = new v("StartInput", 0);
        f9942a = vVar;
        v vVar2 = new v("StopInput", 1);
        f9943b = vVar2;
        v vVar3 = new v("ShowKeyboard", 2);
        f9944c = vVar3;
        v vVar4 = new v("HideKeyboard", 3);
        f9945d = vVar4;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4};
        f9946e = vVarArr;
        u0.c.j(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f9946e.clone();
    }
}
