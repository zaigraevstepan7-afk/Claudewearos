package l7;

import android.widget.FrameLayout;
import com.anonlab.voidlauncher.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10073a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f10074b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f10075c;

    static {
        a aVar = new a();
        aVar.V = new ArrayList();
        aVar.Y = false;
        aVar.Z = 0;
        aVar.W = false;
        aVar.L(new h(2));
        aVar.L(new f());
        aVar.L(new h(1));
        f10073a = aVar;
        f10074b = new ThreadLocal();
        f10075c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, p pVar) {
        ArrayList arrayList = f10075c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (pVar == null) {
            pVar = f10073a;
        }
        p pVarClone = pVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                ((p) obj).x(frameLayout);
            }
        }
        pVarClone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        s sVar = new s();
        sVar.f10071a = pVarClone;
        sVar.f10072b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(sVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(sVar);
    }

    public static q.e b() {
        q.e eVar;
        ThreadLocal threadLocal = f10074b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (q.e) weakReference.get()) != null) {
            return eVar;
        }
        q.e eVar2 = new q.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }
}
