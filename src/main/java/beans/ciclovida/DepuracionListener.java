package beans.ciclovida;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;


public class DepuracionListener implements javax.faces.event.PhaseListener {

    Logger log = LogManager.getRootLogger();

    @Override
    public void afterPhase(PhaseEvent phaseEvent) {

        if (log.isInfoEnabled()) {
            log.info("AFTER PHASE: " + phaseEvent.getPhaseId().toString());
        }
    }

    @Override
    public void beforePhase(PhaseEvent phaseEvent) {
        if (log.isInfoEnabled()) {
            log.info("BEFORE PHASE: " + phaseEvent.getPhaseId().toString());
        }
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
