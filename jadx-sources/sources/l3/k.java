package l3;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import c2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class k implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f9920a;

    /* renamed from: b, reason: collision with root package name */
    public t0.r f9921b;

    public k(t0.r rVar, x0 x0Var) {
        this.f9920a = x0Var;
        this.f9921b = rVar;
    }

    public final void a(t0.r rVar) {
        rVar.closeConnection();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.clearMetaKeyStates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            if (rVar != null) {
                a(rVar);
                this.f9921b = null;
            }
            this.f9920a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.commitContent(inputContentInfo, i10, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.commitText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.deleteSurroundingText(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.deleteSurroundingTextInCodePoints(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.getCursorCapsMode(i10);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.getExtractedText(extractedTextRequest, i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.getSelectedText(i10);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.getTextAfterCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.getTextBeforeCursor(i10, i11);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.performContextMenuAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.performEditorAction(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z2) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.requestCursorUpdates(i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.setComposingRegion(i10, i11);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.setComposingText(charSequence, i10);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        t0.r rVar = this.f9921b;
        if (rVar != null) {
            return rVar.setSelection(i10, i11);
        }
        return false;
    }
}
